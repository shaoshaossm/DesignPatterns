package com.ssm.responsibilitychain;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/3 12:09
 */
public class DepartmentApprover extends Approver {


    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }

}
