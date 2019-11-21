
package Util;

public enum DataType {
    
    JSON, XML;
    
    @Override
    public String toString() {
        return "JSON".equals(this.name())? "json": "xml";
    }
    
}
