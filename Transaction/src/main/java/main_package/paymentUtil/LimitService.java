package main_package.paymentUtil;

import java.util.HashMap;
import java.util.Map;

public class LimitService {

    static Map<String, Double> accounts; //cardId to accountLimit

    static{
        accounts = new HashMap();
        accounts.put( "1", new Double(1000) );
        accounts.put( "2", new Double(2000) );
        accounts.put( "3", new Double(3000) );
    }

    boolean isLimitSufficient( String cardId, Double fare ){
        if( accounts.get( cardId ) >= fare ) return true;
        else return false;
    }

}
