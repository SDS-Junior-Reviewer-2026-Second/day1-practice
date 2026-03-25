interface RemoteControl { void turnOn(); }
class SamsungTV implements RemoteControl { public void turnOn() {} }
class SonyTV implements RemoteControl { public void turnOn() {} }
class Client { void watchTV(RemoteControl rc) { rc.turnOn(); } }
