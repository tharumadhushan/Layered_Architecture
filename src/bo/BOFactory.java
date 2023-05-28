package bo;

import bo.Custom.Impl.CustomerBOImpl;
import bo.Custom.Impl.ItemBOImpl;
import bo.Custom.Impl.PurchaseOrderBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory():boFactory;
    }
    public enum BOTypes{
        CUSTOMER,ITEM,PURCHASE_ORDER
    }
    public SuperBO getBO(BOTypes types){
        switch (types){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PURCHASE_ORDER:
                return new PurchaseOrderBOImpl();
            default:
                return null;
        }
    }
}
