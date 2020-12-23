import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public final class Goods implements Comparable, Serializable {
    private final String name;
    private final String type;
    private final Date deliveryDate;
    private final int price;

    public Goods (String name, String type, Date deliveryDate, int price)
    {
        this.name = name;
        this.type = type;
        this. deliveryDate = deliveryDate;
        this.price = price;
    }

    public String getName ()
    {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash (name, type, deliveryDate, price);
    }

    @Override
    public boolean equals (Object object)
    {
        if (this == object)
        {
            return true;
        } else if ((object == null) || (getClass () != object.getClass ()))
        {
            return false;
        }

        Goods goods = (Goods) object;
        return hashCode () == goods.hashCode ();
    }

    @Override
    public Goods clone () throws CloneNotSupportedException
    {
        return (Goods) super.clone ();
    }

    @Override
    public int compareTo (Object o)
    {
        Goods gds = (Goods) o;

        if (gds.equals (this)) { return 1; }
        return 0;
    }

}