from naoqi import ALProxy
class Hiding:
    robotIP = ""
    def __init__(self, ip):
        self.robotIP = ip

    def _found_hiding_spot_(self, degrees, distance):
        movement = ALProxy("ALMotion", self.robotIP, 9559)



