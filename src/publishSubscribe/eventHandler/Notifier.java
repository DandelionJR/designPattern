package publishSubscribe.eventHandler;

import java.util.*;
import java.lang.reflect.*;

//通知者，可能是老板，也可能是前台秘书
abstract class Notifier {
    protected Method Update;
    abstract public void setAction(String action);
    abstract public void Notify(Object object);
}
