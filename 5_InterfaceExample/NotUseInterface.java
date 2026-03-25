class SamsungTV { void powerOn() {} }
class SonyTV { void ready() {} void start() {} }
class Client {
    void watchTV(SamsungTV tv) { tv.powerOn(); }
    void watchTV(SonyTV tv) { tv.ready(); tv.start(); }
}
