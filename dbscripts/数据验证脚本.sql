
## 测试数据：按交易额收商户费0.8%的手续费，每笔支付订单金额10元（相当于每单收8分钱手续费）
## 订单系统：成功订单、失败订单、等待支付状态订单、其他状态……
## 资金账户：每笔成功支付订单进账9.92元
## 积分账户：每笔成功支付订单进账10个积分（积分总数=成功支付订单数*10）
## 会计系统：每笔成功支付订单记录一条会计原始凭证记录（记录数=成功支付订单数）
## 商户通知：收到支付结果，就会向商户发送通知


##=======订单库：rc_pay_dubbo_order
##
## 订单总笔数：
select count(id) from rp_trade_payment_order; ## 7776

## 支付成功的订单
select count(id) from rp_trade_payment_order where status='SUCCESS'; ## 7766

## 支付中状态的订单数（模拟支付进程关闭是会产生）
select count(id) from rp_trade_payment_order where status='WAITING_PAYMENT'; ## 10



##=======资金账户库：rc_pay_dubbo_account
##
## 账户余额总数（总数/9.92=成功笔数）
select sum(balance) from rp_account; ## 77038.720000

## 账户变动历史记录总数
select count(id) from rp_account_history; ## 7766

## 成功支付订单对应的账户变动历史记录数
select count(id) from rp_account_history where fund_direction='ADD' and status='CONFORM'; ## 7766



##=======积分账户库：rc_pay_dubbo_point
##
## 积分余额总和
select sum(balance) from rp_point_account; ## 77660

## 成功支付订单对应的积分账户变动历史记录数
select count(id) from rp_point_account_history where fund_direction='ADD' and status='CONFORM'; ## 7766



##=======会计系统库：rc_pay_dubbo_accounting
##
## 会计原始凭证数
select count(id) from rp_accounting_voucher; ## 7766



##=======基础库：rc_pay_dubbo_base
##
## 商户通知记录数
select count(id) from rp_notify_record; ## 7762

## 商户通知记录日志
select count(id) from rp_notify_record_log; ## 7762

