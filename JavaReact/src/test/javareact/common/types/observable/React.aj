package test.javareact.common.types.observable;

import java.lang.reflect.Method;

import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import test.javareact.common.packets.content.Attribute;
import test.javareact.common.packets.content.ValueType;


public aspect React {
  
  pointcut hasReactiveAnnotation(Object o):
    target(o) && execution(@test.javareact.common.types.observable.ImpactOn * *(..));

  after(Object o): hasReactiveAnnotation(o) {
    Signature sig = thisJoinPoint.getSignature();
    assert (sig instanceof MethodSignature);
    MethodSignature methodSig = (MethodSignature) sig;
    Method method = methodSig.getMethod();
    System.out.println("Method in React.aj is " + method);
    System.out.println("MethodSig in React.aj is " + methodSig);
    ImpactOn annotation = method.getAnnotation(ImpactOn.class);
    System.out.println(annotation.method());
    String[] impactOnMethods = annotation.method();
    System.out.println("ImpactsOnMethodLength is " + impactOnMethods.length);
    for (String met : impactOnMethods){
    	System.out.println("Method in impactonMethod is " + met);
    }
    Attribute[] attributes = new Attribute[impactOnMethods.length];
    int i=0;
    for (String impactOnMethod : impactOnMethods) {
    	System.out.println("ImpactMethod is " + impactOnMethod);
    try {
      Method methodToInvoke = o.getClass().getMethod(impactOnMethod);
      System.out.println("Method to invoke is " + methodToInvoke);
      Object retVal = methodToInvoke.invoke(o);
      // TODO
      Class<?> type = methodToInvoke.getReturnType();
      System.out.println(type);
      System.out.println("retVal is " + retVal);
      Attribute attr = new Attribute(impactOnMethod + "()", retVal, type);
      attributes[i++] = attr;
    } catch (Exception e) {
      e.printStackTrace();
    }
    }
    ((Observable) o).sendEvent(attributes);
    System.out.println("AAA");
    
  }
  
}