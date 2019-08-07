package com.company.Programmer;

public class Programmer extends Person {

    private final short iq;

    public Programmer(String name, short iq){
        super(name);

        if(iq <120)
            throw new IllegalArgumentException(
                    "programmer iq cannot be less than 120"
            );
            this.iq =iq;
    }

    public int compareTo(Person p){
        if (p instanceof Programmer){ //true
            Programmer pp = (Programmer) p ;
            int result = iq - pp.iq;
            if(result !=0)
                return  -result;
        }
        return super.compareTo(p);
    }
    public String toString(){
        return super.toString() + iq ;
    }
}
