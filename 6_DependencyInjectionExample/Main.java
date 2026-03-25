interface Product { void rent(); }
class Building implements Product { public void rent() {} }
class House implements Product { public void rent() {} }
class Person { void makeBusiness(Product office) { office.rent(); } }
