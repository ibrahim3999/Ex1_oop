package observer;

import api.Member;

import java.util.ArrayList;

public class ConcreteMember   implements Member {
    private UndoableStringBuilder situations;

    public ConcreteMember()
    {
        this.situations=new UndoableStringBuilder();
    }
    @Override
    public void update(UndoableStringBuilder usb) {
      this.situations.setUndo(usb.getUndo());
    }

    public UndoableStringBuilder getSituations() {
        return situations;
    }

    @Override
    public String toString() {
        return "ConcreteMember{" +
                "situations=" + situations +"}";

    }
}
