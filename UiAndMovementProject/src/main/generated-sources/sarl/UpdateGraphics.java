import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.10")
@SarlElementType(15)
@SuppressWarnings("all")
public class UpdateGraphics extends Event {
  @SyntheticMember
  public UpdateGraphics() {
    super();
  }
  
  @SyntheticMember
  public UpdateGraphics(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
}
