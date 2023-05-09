原型模式：
浅克隆：
    implements Cloneable，通过super.clone()的方式实现的克隆是浅克隆
深克隆：实现深克隆有两种常用方式：
    1. 实现Cloneable接口并重写clone()方法
    2. 实现Serializable接口，通过对象的序列化和反序列化实现深克隆
