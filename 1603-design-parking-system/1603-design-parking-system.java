class ParkingSystem {
    int big;
    int small;
    int med;    

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.med=medium;
        this.small=small;        
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && this.big>0)
        {  
            this.big--;
            return true;
        }
        else if(carType==2 && this.med>0)
        {  
            this.med--;
            return true;
        }
        else if(carType==3 && this.small>0)
        {  
            this.small--;
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */