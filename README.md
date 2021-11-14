# springannotations1
Using annotations by eliminating configuration in beans.xml (@Value,@Autowired,@Component)

@Value   ->to initialize values
@Autowired ->to inject dependecy
@Component ->eliminates bean tagh i.e. whenever ioc container encounter this tag, it takes care of object              creation


<context:component-scan base-package="package name"> -> to scan packages while creating objects for                                                               @Compnent classes
