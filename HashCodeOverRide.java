import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeOverRide {
   String name;
   String domain;
   public HashCodeOverRide(String name,String domain){
    this.name=name;
    this.domain=domain;
   }
   @Override
   public boolean equals( Object r){
    if(r instanceof HashCodeOverRide){
        HashCodeOverRide h=(HashCodeOverRide) r;
        return this.name.equals(h.name) && this.domain.equals(h.domain);
    }
    return false;
   }
   @Override
   public int hashCode(){
    return Objects.hash(name,domain);
   }
   public static void main(String[] args) {
    HashCodeOverRide hashCodeOverRide=new HashCodeOverRide("Deepak", "Software Developer");
    HashCodeOverRide hashCodeOverRide1=new HashCodeOverRide("Deepak", "Software Developer");
    System.out.println(hashCodeOverRide.hashCode());
    System.out.println(hashCodeOverRide1.hashCode());
    Set<HashCodeOverRide> sq = new HashSet<>();
    System.out.println(sq.add(hashCodeOverRide));
    System.out.println(sq.add(hashCodeOverRide1));
   }
}
