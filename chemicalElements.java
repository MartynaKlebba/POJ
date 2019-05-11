/*
 * Autorzy Martyna Klebba
 *           Aleksander Ostasz
 *
 * zadanie6 chemicalelements
 * */
public class chemicalElements {
    private String name;
    private String symbol;
    private int number;

    public chemicalElements(String name,String symbol,int number)
    {
        this.name=name;
        this.symbol=symbol;
        this.number=number;
    }
    public String getname()
    {
        return this.name;
    }
    public String getsymbol()
    {
        return this.symbol;
    }
    public int getnumber()
    {
        return this.number;
    }
    public void isalkali()
    {
        switch(number)
        {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
            {
                System.out.println("true");
                break;
            }
            default:
            {
                System.out.println("false");
                break;
            }
        }
    }
    public void istransition()
    {
        if (number>=21&&number<=112)
        {
            if (number>=21&&number<=31)
                System.out.println("true");
            else if (number>=39&&number<=48)
                System.out.println("true");
            else if (number>=72&&number<=80)
                System.out.println("true");
            else if (number>=104&&number<=112)
                System.out.println("true");
            else
                System.out.println("false");
        }
        else
            System.out.println("false");
        public void isMetal()
        {
            switch(number)
            {
                case 13:
                case 49:
                case 50:
                case 81:
                case 82:
                case 83:
                case 113:
                case 114:
                case 115:
                case 116:
                {
                    System.out.println("true");
                    break;
                }
                default:
                {
                    System.out.println("false");
                    break;
                }
            }
        }
        public String toString()
        {
            return "Element[Name=" + name+" , symbol="+symbol+", Number= "+number+"]";
        }
    }


}
