package com.wxsell.luffy.pojo.banner;

import java.io.Serializable;

public class BannerItem implements Serializable {
    private Integer id;

    private String img;

    /**
     * ִ�йؼ��֣����ݲ�ͬ��type���岻ͬ
     */
    private String keyWord;

    /**
     * ��ת���ͣ����ܵ�����Ʒ�����ܵ���ר�⣬���ܵ���������0���޵���1��������Ʒ;2:����ר��
     */
    private Byte type;

    private Integer deleteTime;

    /**
     * ���������banner��
     */
    private Integer bannerId;

    private Integer updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", img=").append(img);
        sb.append(", keyWord=").append(keyWord);
        sb.append(", type=").append(type);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", bannerId=").append(bannerId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}