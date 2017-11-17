package com.mo.test.model;

public class OrderExtend {
    /**
     * id（非自增，随tx_order表id）
     */
    private Long id;

    /**
     * 确认物流发送时间：0 未确认，1 已确认
     */
    private Byte confirmDeliverStatus;

    /**
     * 三工维护状态，0：默认未维护,1:已维护
     */
    private Byte workerStatus;

    /**
     * id（非自增，随tx_order表id）
     * @return id id（非自增，随tx_order表id）
     */
    public Long getId() {
        return id;
    }

    /**
     * id（非自增，随tx_order表id）
     * @param id id（非自增，随tx_order表id）
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 确认物流发送时间：0 未确认，1 已确认
     * @return confirm_deliver_status 确认物流发送时间：0 未确认，1 已确认
     */
    public Byte getConfirmDeliverStatus() {
        return confirmDeliverStatus;
    }

    /**
     * 确认物流发送时间：0 未确认，1 已确认
     * @param confirmDeliverStatus 确认物流发送时间：0 未确认，1 已确认
     */
    public void setConfirmDeliverStatus(Byte confirmDeliverStatus) {
        this.confirmDeliverStatus = confirmDeliverStatus;
    }

    /**
     * 三工维护状态，0：默认未维护,1:已维护
     * @return worker_status 三工维护状态，0：默认未维护,1:已维护
     */
    public Byte getWorkerStatus() {
        return workerStatus;
    }

    /**
     * 三工维护状态，0：默认未维护,1:已维护
     * @param workerStatus 三工维护状态，0：默认未维护,1:已维护
     */
    public void setWorkerStatus(Byte workerStatus) {
        this.workerStatus = workerStatus;
    }
}