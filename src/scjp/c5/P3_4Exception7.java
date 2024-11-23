package scjp.c5;


class SubException extends Exception { }
class SubSubException extends SubException { }

class CC { void doStuff() throws SubException { } }

class CC2 extends CC { void doStuff() throws SubSubException { } }

// class CC3 extends CC { void doStuff() throws Exception { } } // no compila, porque Exception es > que SubException

class CC4 extends CC { void doStuff(int x) throws Exception { } } // si se agrega un parametro, entonces es otro metodo

class CC5 extends CC { void doStuff() { } }  // arriba esta declarado throws SubException, por lo tanto, permitido no poner throws


class BB { void doStuff() {}  }  // si no hay throws, entonces abajo no puede haber throws
// class BB2 extends BB { void doStuff() throws Exception { } }
// class BB3 extends BB { void doStuff() throws SubException { } }


public class P3_4Exception7 {

}
