package MyIndividual_Interfaces;
import MyIndividual_Exceptions.*;

public interface IExceptionChecker {
     void checkLiteral() throws ContainsALiteralExp;
     void checkTwoElems() throws ContainsTwoElemExp;
      void checkMoreThanFiveElems() throws MoreThanFiveElmsExp;
}
