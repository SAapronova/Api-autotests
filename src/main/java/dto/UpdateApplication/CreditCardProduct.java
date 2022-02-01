package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class CreditCardProduct {
    public String cardName;
    public String cardId;
    public int loanSum;
    public String cardCategory;
    public String cardType;
    public String productCode;
    public int loanSumRecommended;
    public String paymentSystem;
    public String currency;
    public int gracePeriod;
    public int gracePeriodCash;
    public String cardIssueType;
    public String deliveryBranch;
    public boolean acceptedLimitEnabled;
    public double cashWithdrawalFees;
    public int cashWithdrawalFeesMin;
    public double creditPercent;
    public int annualFees;
    public int firstYearFees;
    public String cardIssueTypeDescription;
    public GraceProduct graceProduct;
}
