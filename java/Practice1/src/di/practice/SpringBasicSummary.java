package di.practice;

/*
 * ======================================================================
 *  Spring Basic Summary (강의 0분 ~ 51분 범위)
 * ======================================================================
 *
 *  [전체 구성]
 *  Spring Core(Bean, DI, @Qualifier, @Primary, Scope, Environment, Profile, @Value)
 *  -> Spring Boot -> Spring Initializr -> 실제 프로젝트 생성 순으로 구성된다.
 *
 *  [핵심 흐름 한 줄 요약]
 *  Spring Boot가 애플리케이션을 시작하고, Spring은 애플리케이션 객체를 Bean으로 관리하며,
 *  IoC Container가 Bean을 생성하고 Dependency Injection으로 서로 연결한다.
 *
 *  Spring Boot starts the application, Spring manages application objects as Beans,
 *  and the IoC Container creates and connects those Beans through Dependency Injection.
 *
 *
 * ----------------------------------------------------------------------
 *  1. Why Spring (Spring을 사용하는 이유)
 * ----------------------------------------------------------------------
 *  Java만으로도 객체를 직접 생성하고 연결할 수 있다.
 *
 *      PaymentService paymentService = new CashPaymentService();
 *      OrderService orderService = new OrderService(paymentService);
 *
 *  소규모 프로그램에서는 문제가 없으나, 실제 백엔드 애플리케이션에는
 *  Controller, Service, Repository, 외부 API Client, 보안 객체, DB 관련 객체 등
 *  다수의 객체가 존재한다. 이를 모두 수동으로 생성하고 연결하는 일은 비효율적이다.
 *  Spring은 이러한 객체의 생성, 관리, 연결을 대신 수행한다.
 *
 *  Spring manages the objects and infrastructure of your application
 *  so that you do not have to wire everything manually.
 *  - wire(와이어링): 객체끼리 서로 연결하는 것.
 *    (wire = to connect things together; here, to connect objects to each other)
 *
 *
 * ----------------------------------------------------------------------
 *  2. IoC - Inversion of Control (제어의 역전)
 *     (inversion = reversing the direction; control = who decides when and how objects are created)
 * ----------------------------------------------------------------------
 *  정의: 객체 생성과 관리의 주도권을 개발자 코드에서 Spring으로 넘기는 것.
 *
 *      기존 방식   : 개발자 코드 -> 객체 생성 -> 객체 연결
 *      Spring 방식 : Spring      -> 객체 생성 -> 객체 연결
 *
 *  앞서 직접 작성한 new CashPaymentService(), new OrderService(paymentService)
 *  역할을 Spring이 대신 수행하게 된다.
 *
 *  Instead of your code creating and managing every object,
 *  Spring takes control of object management.
 *  - IoC Container: 객체를 생성, 설정, 조립하는 Spring의 핵심 실행 환경.
 *    (container = a runtime that holds and manages objects)
 *    (Spring 공식 문서에서도 이 역할로 설명한다.)
 *
 *
 * ----------------------------------------------------------------------
 *  3. Bean (빈)
 *     (bean = the name Spring gives to an object it manages; originally from "JavaBeans", reusable Java components)
 * ----------------------------------------------------------------------
 *  정의: Spring이 생성, 설정, 관리하는 Java 객체.
 *
 *  Bean은 새로운 자료형이 아니라 "관리 주체"에 따른 구분이다.
 *      - new OrderService(...) 로 직접 만들고 Spring과 무관하면 -> 일반 Java 객체
 *      - Spring이 OrderService 객체를 만들어 관리하면           -> Spring Bean
 *
 *  A Spring Bean is simply an object that is created, configured,
 *  and managed by Spring.
 *
 *
 * ----------------------------------------------------------------------
 *  4. Stereotype Annotation & Component Scanning
 *     (stereotype = a typical role/category; annotation = a label attached to code; scanning = searching through)
 *     (Bean 등록 표시와 자동 탐색)
 * ----------------------------------------------------------------------
 *  Spring이 모든 클래스를 관리할 수는 없으므로, 관리 대상 클래스에 표시를 한다.
 *
 *      @Component   : 일반적인 Spring 관리 대상           (component = a part of a larger system)
 *      @Service     : 업무 로직(비즈니스 로직)을 담당하는 관리 대상  (service = a unit that does business work)
 *      @Repository  : 데이터 접근(DB 작업)을 담당하는 관리 대상     (repository = a storage place for data)
 *      @Controller  : 웹 요청 처리를 담당하는 관리 대상          (controller = the one that receives and directs web requests)
 *
 *  예) @Service public class PostService { }
 *      -> "PostService 객체를 Spring이 생성하고 관리한다"는 의미.
 *
 *  @Service tells Spring that this class should be managed
 *  as a service component.
 *
 *  - Component Scanning(컴포넌트 스캔, scan = to search through): Spring이 프로젝트를 탐색하며
 *    위 표시가 붙은 클래스를 찾아 Bean으로 등록하는 과정.
 *    Spring scans the application and discovers classes marked as components.
 *  - @Bean 은 클래스가 아닌 "메서드"에 붙여 Bean을 직접 등록하는 방식이다.
 *    (이후 "Spring Beans in Action" 실습에서 @Bean, @Component, @Service,
 *     @Repository를 코드로 다룬다.)
 *
 *
 * ----------------------------------------------------------------------
 *  5. DI - Dependency Injection (의존성 주입)
 *     (dependency = something you rely on; injection = putting something in from outside)
 * ----------------------------------------------------------------------
 *  Dependency(의존성): 어떤 객체가 동작하기 위해 필요한 다른 객체.
 *  A dependency is another object that this object needs to do its job.
 *
 *      public class OrderService {
 *          private final PaymentService paymentService;   // <- OrderService의 dependency
 *
 *          public OrderService(PaymentService paymentService) {
 *              this.paymentService = paymentService;
 *          }
 *      }
 *
 *  Dependency Injection(의존성 주입): 필요한 객체를 내부에서 직접 new 하지 않고
 *  외부에서 전달받는 방식.
 *  Dependency Injection means giving an object the dependencies it needs
 *  from outside instead of letting the object create them itself.
 *
 *  - Manual DI(수동 DI, manual = done by hand): 개발자가 직접 객체를 만들어 넣어주는 방식.
 *  - Spring DI: Spring이 Bean을 준비하고, 다른 Bean이 필요로 하면 알아서 주입한다.
 *
 *      Spring이 PaymentService Bean 준비
 *        -> OrderService Bean 생성 시도
 *        -> PaymentService 필요 확인
 *        -> PaymentService Bean을 생성자에 주입
 *
 *  [IoC와 DI의 관계]
 *      IoC : 객체 "관리"의 주도권을 Spring이 가진다.
 *      DI  : 객체 간 "연결"을 Spring이 수행한다. (IoC를 구현하는 방법 중 하나)
 *
 *
 * ----------------------------------------------------------------------
 *  6. Constructor Injection / @Primary / @Qualifier
 *     (constructor = the method that builds an object; primary = main, first choice; qualifier = something that narrows down a choice)
 * ----------------------------------------------------------------------
 *  Constructor Injection(생성자 주입): 생성자를 통해 dependency를 전달받는 방식.
 *  Constructor Injection means receiving dependencies through the constructor.
 *  -> 가장 우선적으로 사용하는 DI 방식이며, final 필드와 함께 쓸 수 있어 안전하다.
 *
 *  문제 상황:
 *      CardPaymentService implements PaymentService
 *      CashPaymentService implements PaymentService
 *  OrderService가 PaymentService를 요구하면 후보가 두 개이므로
 *  Spring은 어느 Bean을 주입할지 결정하지 못한다.
 *
 *  해결 방법:
 *      @Primary    : 후보가 여러 개일 때 기본으로 사용할 Bean을 지정한다.
 *                    Use this one by default.
 *      @Qualifier  : 사용할 Bean을 이름으로 정확히 지정한다.
 *                    Use this specific Bean.
 *
 *  핵심: 같은 타입의 후보가 여러 개이면 어떤 Bean을 사용할지 Spring에 알려야 한다.
 *        (annotation 문법 암기보다 이 원리의 이해가 우선)
 *
 *
 * ----------------------------------------------------------------------
 *  7. Scope / Environment / Profile / @Value
 * ----------------------------------------------------------------------
 *  우선순위는 낮으며, 세부 문법은 이후에 학습해도 된다.
 *
 *  - Bean Scope(빈 범위, scope = the range of existence): Bean 인스턴스를 몇 개 생성하고 얼마나 유지할지 결정한다.
 *    Bean scope determines how many Bean instances Spring creates
 *    and how long they live.
 *  - Environment / Profile / @Value: 모두 "설정값을 다루는 기능"으로 묶어서 이해한다.
 *      Environment : 실행 환경과 설정값에 접근하는 Spring의 인터페이스
 *                    (environment = the surroundings the program runs in)
 *      Profile     : 환경(개발, 운영 등)에 따라 다른 설정/Bean을 적용하는 기능
 *                    (profile = a named set of settings for one situation)
 *      @Value      : 설정 파일의 값을 코드의 필드로 주입하는 annotation
 *                    (value = a configured piece of data)
 *    설정값 예)  server.port=8080 ,  spring.datasource.url=...
 *
 *
 * ----------------------------------------------------------------------
 *  8. AOP / Data Access (Spring의 그 외 기능 소개)
 * ----------------------------------------------------------------------
 *  객체 관리와 별개의 기능으로, 현 단계에서는 개념 소개 수준만 이해하면 된다.
 *
 *  - AOP - Aspect-Oriented Programming (관점 지향 프로그래밍)
 *    (aspect = one side of a problem, here a cross-cutting concern such as logging; oriented = organized around)
 *    여러 곳에서 반복되는 공통 작업을 업무 로직에서 분리하여 따로 처리하는 방식.
 *    AOP lets you handle common behavior separately instead of repeating it
 *    throughout your business code.
 *    대표 예: Logging(로깅, recording what happens), Transaction(트랜잭션, a group of DB steps that succeed or fail together),
 *            Security(보안, protection against unauthorized access)
 *
 *  - Data Access (데이터 접근)
 *    (data access = reading and writing stored data; abstraction = hiding complex details behind a simple interface)
 *    DB 작업을 간편하게 하도록 돕는 추상화 기능.
 *    Spring provides abstractions that make working with databases easier.
 *    예) postRepository.findById(id);
 *
 *
 * ----------------------------------------------------------------------
 *  9. Spring Framework vs Spring Boot
 * ----------------------------------------------------------------------
 *  - Spring Framework (framework = a ready-made structure to build programs on): 실제 기능을 제공하는 핵심 (IoC, DI, AOP, Data Access 등).
 *  - Spring Boot (boot = to start up; the name hints at "getting started quickly"): Spring을 더 쉽게 설정, 생성, 실행하도록 준비해주는 도구.
 *    Spring Boot makes Spring applications easier to configure,
 *    create, and run.
 *
 *      Spring Framework = 기능(엔진)
 *      Spring Boot      = 그 기능을 쉽게 사용할 수 있도록 환경을 준비해주는 도구
 *
 *
 * ----------------------------------------------------------------------
 *  10. Spring Initializr
 *     (initializr = a tool that initializes, i.e. sets up the starting state of, a project)
 * ----------------------------------------------------------------------
 *  Spring Boot 프로젝트의 기본 구조(뼈대)를 생성해주는 도구.
 *  Spring Initializr generates the starting structure of a Spring Boot project.
 *
 *  선택 항목: 언어(Java), Spring Boot 버전, Build Tool(Maven / Gradle),
 *            Java 버전, Dependencies(libraries to use), Project 이름(Artifact / Name), Package 이름(Group / Package name)
 *  주의: 프로그램 코드를 대신 작성해주는 것이 아니라 개발 시작 준비를 대신해주는 도구이다.
 *
 *
 * ----------------------------------------------------------------------
 *  11. Dependency의 두 가지 의미 (구분 필요)
 * ----------------------------------------------------------------------
 *  같은 영어 단어이지만 문맥에 따라 의미가 다르다.
 *
 *  (1) Initializr / build.gradle 의 dependency
 *      = 프로젝트가 사용하는 외부 라이브러리
 *      An external library that your project depends on.
 *      예) Spring Web, Spring Data JPA, MySQL Driver, Validation
 *
 *  (2) Dependency Injection 의 dependency
 *      = 객체가 동작하기 위해 필요한 다른 객체 (예: OrderService의 PaymentService)
 *
 *
 * ----------------------------------------------------------------------
 *  12. Maven / Gradle (Build Tool)
 *     (build = turning source code into a runnable program; tool = a program that automates a task)
 * ----------------------------------------------------------------------
 *  A build tool manages dependencies and automates building,
 *  testing, and packaging the application.
 *  - Maven  : 설정 파일 pom.xml
 *  - Gradle : 설정 파일 build.gradle  (현재 사용 중인 도구)
 *  - Spring Boot는 두 도구를 모두 공식 지원한다.
 *  - 강의의 pom.xml 은 Gradle 프로젝트의 build.gradle 에 대응한다. (Maven 문법 암기 불필요)
 *
 *
 * ----------------------------------------------------------------------
 *  13. 프로젝트 구조
 * ----------------------------------------------------------------------
 *      src
 *      |-- main            (main = the production code)
 *      |   |-- java        : 실제 Java 코드 (Controller, Service, Repository, Entity 등)
 *      |   `-- resources   : 설정 및 리소스 파일 (application.properties / application.yml)
 *      `-- test            : 테스트 코드 (test = code that checks other code works)
 *
 *  메인 클래스:
 *
 *      @SpringBootApplication
 *      public class Application {
 *          public static void main(String[] args) {
 *              SpringApplication.run(Application.class, args);
 *          }
 *      }
 *
 *  - main()                    : Java 프로그램의 시작점 (main = principal, the entry point)
 *  - SpringApplication.run()   : Spring Boot 애플리케이션 실행 (run = to start executing)
 *  - @SpringBootApplication    : Spring Boot 메인 애플리케이션임을 나타내는 annotation
 *                                (application = a complete program)
 *                                (루트 패키지에 위치시키는 것이 일반적인 구조)
 *
 *
 * ----------------------------------------------------------------------
 *  14. 자가 점검 (이 범위에서 설명할 수 있어야 하는 내용)
 * ----------------------------------------------------------------------
 *  1) Spring이 필요한 이유 : 객체 관리, 연결 등 반복적인 기반 작업을 대신 처리한다.
 *  2) Bean                : Spring이 관리하는 Java 객체.
 *  3) IoC                 : 객체 생성, 관리의 주도권을 개발자 코드에서 Spring으로 넘기는 것.
 *  4) DI                  : 필요한 객체를 직접 new 하지 않고 외부에서 전달받는 것.
 *  5) Spring Boot         : Spring을 쉽게 설정, 시작, 실행하도록 해주는 도구.
 *  6) Initializr          : Spring Boot 프로젝트의 기본 뼈대를 생성하는 도구.
 *  7) Maven / Gradle      : dependency 관리와 프로젝트 빌드를 담당하는 도구.
 *  8) AOP / Data Access   : AOP는 공통 반복 작업 처리, Data Access는 DB 작업 간소화.
 *                           그 이상의 세부 내용은 현 단계에서 필수가 아니다.
 */
public class SpringBasicSummary
{
}
