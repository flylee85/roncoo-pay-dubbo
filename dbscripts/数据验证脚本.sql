
## �������ݣ������׶����̻���0.8%�������ѣ�ÿ��֧���������10Ԫ���൱��ÿ����8��Ǯ�����ѣ�
## ����ϵͳ���ɹ�������ʧ�ܶ������ȴ�֧��״̬����������״̬����
## �ʽ��˻���ÿ�ʳɹ�֧����������9.92Ԫ
## �����˻���ÿ�ʳɹ�֧����������10�����֣���������=�ɹ�֧��������*10��
## ���ϵͳ��ÿ�ʳɹ�֧��������¼һ�����ԭʼƾ֤��¼����¼��=�ɹ�֧����������
## �̻�֪ͨ���յ�֧��������ͻ����̻�����֪ͨ


##=======�����⣺rc_pay_dubbo_order
##
## �����ܱ�����
select count(id) from rp_trade_payment_order; ## 7776

## ֧���ɹ��Ķ���
select count(id) from rp_trade_payment_order where status='SUCCESS'; ## 7766

## ֧����״̬�Ķ�������ģ��֧�����̹ر��ǻ������
select count(id) from rp_trade_payment_order where status='WAITING_PAYMENT'; ## 10



##=======�ʽ��˻��⣺rc_pay_dubbo_account
##
## �˻��������������/9.92=�ɹ�������
select sum(balance) from rp_account; ## 77038.720000

## �˻��䶯��ʷ��¼����
select count(id) from rp_account_history; ## 7766

## �ɹ�֧��������Ӧ���˻��䶯��ʷ��¼��
select count(id) from rp_account_history where fund_direction='ADD' and status='CONFORM'; ## 7766



##=======�����˻��⣺rc_pay_dubbo_point
##
## ��������ܺ�
select sum(balance) from rp_point_account; ## 77660

## �ɹ�֧��������Ӧ�Ļ����˻��䶯��ʷ��¼��
select count(id) from rp_point_account_history where fund_direction='ADD' and status='CONFORM'; ## 7766



##=======���ϵͳ�⣺rc_pay_dubbo_accounting
##
## ���ԭʼƾ֤��
select count(id) from rp_accounting_voucher; ## 7766



##=======�����⣺rc_pay_dubbo_base
##
## �̻�֪ͨ��¼��
select count(id) from rp_notify_record; ## 7762

## �̻�֪ͨ��¼��־
select count(id) from rp_notify_record_log; ## 7762

