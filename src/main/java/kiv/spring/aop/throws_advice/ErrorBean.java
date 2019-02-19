package kiv.spring.aop.throws_advice;

public class ErrorBean {
    public void errorProneMethod() throws Exception{
        throw new Exception("Generic exception");
    }
    
    public void otherErorProneMethod() throws Exception{
        throw new IllegalArgumentException("Illegal Argument exception");
    }

}
