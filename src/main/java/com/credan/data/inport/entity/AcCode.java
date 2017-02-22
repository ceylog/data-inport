package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "ac_code")
public class AcCode {
    @Id
    @Column(name = "idac_code")
    private String idacCode;

    /**
     * 编码名称
     */
    @Column(name = "codeName")
    private String codename;

    /**
     * 编码字符
     */
    @Column(name = "codeString")
    private String codestring;

    /**
     * 描述
     */
    @Column(name = "codeDicreption")
    private String codedicreption;

    /**
     * @return idac_code
     */
    public String getIdacCode() {
        return idacCode;
    }

    /**
     * @param idacCode
     */
    public void setIdacCode(String idacCode) {
        this.idacCode = idacCode;
    }

    /**
     * 获取编码名称
     *
     * @return codeName - 编码名称
     */
    public String getCodename() {
        return codename;
    }

    /**
     * 设置编码名称
     *
     * @param codename 编码名称
     */
    public void setCodename(String codename) {
        this.codename = codename;
    }

    /**
     * 获取编码字符
     *
     * @return codeString - 编码字符
     */
    public String getCodestring() {
        return codestring;
    }

    /**
     * 设置编码字符
     *
     * @param codestring 编码字符
     */
    public void setCodestring(String codestring) {
        this.codestring = codestring;
    }

    /**
     * 获取描述
     *
     * @return codeDicreption - 描述
     */
    public String getCodedicreption() {
        return codedicreption;
    }

    /**
     * 设置描述
     *
     * @param codedicreption 描述
     */
    public void setCodedicreption(String codedicreption) {
        this.codedicreption = codedicreption;
    }
}