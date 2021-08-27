class Car:                                                                              
    'This is a Car class'
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    
    def accelerate(self):
        print(self.manufacturer +" " +self.model +" is moving")
    
    def stop(self):
        print(self.manufacturer +" " +self.model +" has stopped")

c1=Car("Maruti", "800", "2000", "Manual", "Black")                              #Creating object of Car
c1.accelerate()                                                                 #Using c1 object to call accelate() method 
c1.stop()                                                                       #Stopping the car