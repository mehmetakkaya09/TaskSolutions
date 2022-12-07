package customClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        Offer offer6 = new Offer();
        offer6.setInfo("TX", "CapitalOne", "BA", 85000, false, false, true, false);
        Offer offer7 = new Offer();
        offer7.setInfo("VA", "Sony Inc", "SDET", 130000, true, true, true, true);

        Offer[] offers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(offers));
        fullTimeOffers.removeIf(p->p.isFullTime == false);
        System.out.println(fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(offers));
        localOffers.removeIf(p->!(p.location.equals("VA") || p.location.equals("TX")));
        System.out.println(localOffers.size());

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();
        offersWithBenefits.addAll(Arrays.asList(offers));
        offersWithBenefits.removeIf(p-> p.hasBenefit == false && p.hasPTO == false);
        System.out.println(offersWithBenefits.size());

        ArrayList<Offer> sdetOffers = new ArrayList<>();
        sdetOffers.addAll(Arrays.asList(offers));
        sdetOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("sdet"));
        for (Offer sdetOffer : sdetOffers) {
            System.out.println(sdetOffer.companyName);
        }
        ArrayList<Offer> offersWith100K = new ArrayList<>();
        offersWith100K.addAll(Arrays.asList(offers));
        offersWith100K.removeIf(p->p.salary <100000);
        System.out.println(offersWith100K.size());

    }
}
/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */