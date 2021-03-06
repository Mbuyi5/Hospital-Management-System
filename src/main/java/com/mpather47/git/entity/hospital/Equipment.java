package com.mpather47.git.entity.hospital;

public class Equipment {
    private String equipmentId;
    private String name;
    private String desc;
    private int quantity;
    private Room details;

    private Equipment(){

    }

    private Equipment(Builder b){
        this.equipmentId = b.equipment;
        this.name = b.name;
        this.desc = b.desc;
        this.quantity = b.quantity;
        this.details = b.details;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    public int getQuantity() {
        return quantity;
    }
    public Room getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipment='" + equipmentId + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", quantity=" + quantity +
                ", room=" + details +
                '}';
    }

    public static class Builder{
        private String equipment;
        private String name;
        private String desc;
        private int quantity;
        private Room details;

        public Builder setEquipment(String equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setDetails(Room details){
            this.details = details;
            return this;
        }
        public Builder copy(Equipment e){
            this.equipment = e.equipmentId;
            this.name = e.name;
            this.desc = e.desc;
            this.quantity = e.quantity;
            this.details = e.details;
            return this;
        }

        public Equipment build(){
            return new Equipment(this);
        }
    }
}
