import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Alexis
 */
@SarlSpecification("0.10")
@SarlElementType(15)
@SuppressWarnings("all")
public class Move extends Event {
  @SyntheticMember
  public Move() {
    super();
  }
  
  @SyntheticMember
  public Move(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
}
