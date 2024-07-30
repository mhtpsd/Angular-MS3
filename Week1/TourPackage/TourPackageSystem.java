package TourPackage;

import java.util.Comparator;

class TourPackageSystem implements Comparable<TourPackageSystem>{
    int packageID;
    String destination;
    int price;
    @Override
    public int compareTo(TourPackageSystem o) {
            return this.destination.compareTo(o.destination);
    }
}

class Sortbyprice implements Comparator<TourPackageSystem> {

    public int compare(TourPackageSystem a, TourPackageSystem b)
    {
        return (a.price - b.price);
    }
}
