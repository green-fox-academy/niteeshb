package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
//      "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//      Lorem ipsum dolor sit amet.
//      "Wait but why" titled by Tim Urban posted at "2010.10.10."
//      A popular long-form, stick-figure-illustrated blog about almost everything.
//      "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
////      Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.
    BlogPost object1 = new BlogPost("Lorem Ipsum", "John Doe", "2000.05.04.");
    object1.text = "Lorem ipsum dolor sit amet.";
    BlogPost object2 = new BlogPost("Wait but why", "Tim Urban", "2010.10.10.");
    object2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    BlogPost object3 = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton", "2017.03.28..");
    object3.text = " Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

  }
}
