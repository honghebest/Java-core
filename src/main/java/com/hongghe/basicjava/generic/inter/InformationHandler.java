package com.hongghe.basicjava.generic.inter;

/**
 * @author: hongghe @date: 2019-03-22 11:45
 */
public class InformationHandler<K extends BasicInformation> {

    public void getInformation(K information) {
        if (information != null) {
            System.out.println("information = " + information);
        }

        if (information instanceof StudentInformation) {
            StudentInformation student = (StudentInformation) information;

            System.out.println("this is student information" + student.getUser().getAddress());
        }
    }

    public static void main(String[] args) {
        InformationHandler<StudentInformation> informationHandler = new InformationHandler<>();
        informationHandler.getInformation(new StudentInformation());
    }
}
