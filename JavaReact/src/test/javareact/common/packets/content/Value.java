package test.javareact.common.packets.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Value implements Serializable {
  private static final long serialVersionUID = -4909992361317067576L;

  private final int intVal;
  private final double doubleVal;
  private final String stringVal;
  private final boolean boolVal;
  private List<Integer> listIntVal;
  private  List<Double> listDoubleVal;
  private  List<String> listStringVal;
  private  List<Boolean> listBoolVal;
  private  ValueType type;

  public Value(int val) {
    intVal = val;
    doubleVal = 0;
    stringVal = null;
    boolVal = false;
    listIntVal = null;
    listDoubleVal = null;
    listStringVal = null;
    listBoolVal = null;
    type = ValueType.INT;
  }

  public Value(double val) {
    intVal = 0;
    doubleVal = val;
    stringVal = null;
    boolVal = false;
    listIntVal = null;
    listDoubleVal = null;
    listStringVal = null;
    listBoolVal = null;
    type = ValueType.DOUBLE;
  }

  public Value(String val) {
    intVal = 0;
    doubleVal = 0;
    stringVal = val;
    boolVal = false;
    listIntVal = null;
    listDoubleVal = null;
    listStringVal = null;
    listBoolVal = null;
    type = ValueType.STRING;
  }

  public Value(boolean val) {
    intVal = 0;
    doubleVal = 0;
    stringVal = null;
    boolVal = val;
    listIntVal = null;
    listDoubleVal = null;
    listStringVal = null;
    listBoolVal = null;
    type = ValueType.BOOL;
  }
  
  public Value(List<?> val, ValueType type) {
	    intVal = 0;
	    doubleVal = 0;
	    stringVal = null;
	    boolVal = false;
	    listIntVal = null;
	    listDoubleVal = null;
	    listStringVal = null;
	    listBoolVal = null;
	    switch (type){
	    case LISTINT: listIntVal = (List<Integer>) val;
	    case LISTDOUBLE: listDoubleVal = (List<Double>) val;
	    case LISTBOOL: listBoolVal = (List<Boolean>) val;
	    case LISTSTRING: listStringVal = (List<String>) val;
	    default: ;
	    }
	    //type = ValueType.LISTINT;
	  }
  
  
public final ValueType getType() {
    return type;
  }

  public final int intVal() {
    return intVal;
  }

  public final double doubleVal() {
    if (type == ValueType.INT){ 
	  return (double)intVal;
    }
    else return doubleVal; 
  }

  public final String stringVal() {
    return stringVal;
  }

  public final boolean boolVal() {
    return boolVal;
  }
  
  public final List<Integer> listIntVal() {
	    return listIntVal;
	  }
  
  public final List<Double> listDoubleVal() {
	    return listDoubleVal;
	  }
  
  public final List<String> listStringVal() {
	    return listStringVal;
	  }
  
  public final List<Boolean> listBoolVal() {
	    return listBoolVal;
	  }
  
  

//  @Override
//  public int hashCode() {
//    final int prime = 31;
//    int result = 1;
//    result = prime * result + (boolVal ? 1231 : 1237);
//    long temp;
//    temp = Double.doubleToLongBits(doubleVal);
//    result = prime * result + (int) (temp ^ (temp >>> 32));
//    result = prime * result + intVal;
//    result = prime * result + ((stringVal == null) ? 0 : stringVal.hashCode());
//    result = prime * result + ((type == null) ? 0 : type.hashCode());
//    return result;
//  }
//
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) {
//      return true;
//    }
//    if (obj == null) {
//      return false;
//    }
//    if (!(obj instanceof Value)) {
//      return false;
//    }
//    Value other = (Value) obj;
//    if (boolVal != other.boolVal) {
//      return false;
//    }
//    if (Double.doubleToLongBits(doubleVal) != Double.doubleToLongBits(other.doubleVal)) {
//      return false;
//    }
//    if (intVal != other.intVal) {
//      return false;
//    }
//    if (stringVal == null) {
//      if (other.stringVal != null) {
//        return false;
//      }
//    } else if (!stringVal.equals(other.stringVal)) {
//      return false;
//    }
//    if (type != other.type) {
//      return false;
//    }
//    return true;
//  }

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (boolVal ? 1231 : 1237);
	long temp;
	temp = Double.doubleToLongBits(doubleVal);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + intVal;
	result = prime * result
			+ ((listBoolVal == null) ? 0 : listBoolVal.hashCode());
	result = prime * result
			+ ((listDoubleVal == null) ? 0 : listDoubleVal.hashCode());
	result = prime * result
			+ ((listIntVal == null) ? 0 : listIntVal.hashCode());
	result = prime * result
			+ ((listStringVal == null) ? 0 : listStringVal.hashCode());
	result = prime * result + ((stringVal == null) ? 0 : stringVal.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Value other = (Value) obj;
	if (boolVal != other.boolVal)
		return false;
	if (Double.doubleToLongBits(doubleVal) != Double
			.doubleToLongBits(other.doubleVal))
		return false;
	if (intVal != other.intVal)
		return false;
	if (listBoolVal == null) {
		if (other.listBoolVal != null)
			return false;
	} else if (!listBoolVal.equals(other.listBoolVal))
		return false;
	if (listDoubleVal == null) {
		if (other.listDoubleVal != null)
			return false;
	} else if (!listDoubleVal.equals(other.listDoubleVal))
		return false;
	if (listIntVal == null) {
		if (other.listIntVal != null)
			return false;
	} else if (!listIntVal.equals(other.listIntVal))
		return false;
	if (listStringVal == null) {
		if (other.listStringVal != null)
			return false;
	} else if (!listStringVal.equals(other.listStringVal))
		return false;
	if (stringVal == null) {
		if (other.stringVal != null)
			return false;
	} else if (!stringVal.equals(other.stringVal))
		return false;
	if (type != other.type)
		return false;
	return true;
}



@Override
  public String toString() {
    switch (type) {
    case INT:
      return String.valueOf(intVal);
    case DOUBLE:
      return String.valueOf(doubleVal);
    case STRING:
      return stringVal;
    case BOOL:
      return String.valueOf(boolVal);
    case LISTINT:
	      return listIntVal.toString(); 
    case LISTDOUBLE:
	      return listDoubleVal.toString(); 
    case LISTSTRING:
	      return listStringVal.toString(); 
    case LISTBOOL:
	      return listBoolVal.toString(); 
    default:
      assert false : type;
      return "err";
    }
  }



}
