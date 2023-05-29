class boat extends Vehicle {

 

  private String mainSailColor;

 

  public void floatOnWater() {

 

    System.out.println("Boat is floating on water.");

 

  }

 

  // Getter and setter for mainSailColor

 

  public String getMainSailColor() {

 

    return mainSailColor;

 

  }

 

  public void setMainSailColor(String mainSailColor) {

 

    this.mainSailColor = mainSailColor;

 

  }

 

}

 

 

 

class FandangoYacht extends boat {

 

  public FandangoYacht(String mainSailColor) {

 

    setMainSailColor(mainSailColor);

 

  }

 

  @Override

 

  public void floatOnWater() {

 

    System.out.println();

 

    System.out.println("Fandango Yacht is floating on water.");

 

  }

 

}

 