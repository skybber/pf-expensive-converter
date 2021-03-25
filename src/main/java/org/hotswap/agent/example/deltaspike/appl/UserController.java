package org.hotswap.agent.example.deltaspike.appl;

import java.io.Serializable;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class UserController implements Serializable {

    private static final long serialVersionUID = -4538115105092134763L;

    private boolean check;

    /**
     * @return the check
     */
    public boolean isCheck() {
        return check;
    }

    /**
     * @param check the check to set
     */
    public void setCheck(boolean check) {
        this.check = check;
    }
}
