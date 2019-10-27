# Sample 패키지

의존성 주입을 확인하기 위한 예제이다.
Restaurant 클래스는 Chef 객체가 필요하여 Component를 통해 ApplicationContext가 두 빈을 관리할 수 있게하고,
@Autowired를 이용하여 Setter 메서드를 통해 의존성을 주입하는 예제이다.