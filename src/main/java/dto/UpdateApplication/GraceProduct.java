package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class GraceProduct {
    public int cashWithdrawalFeesMin;
    public double maxPercentRate;
    public double notConfCreditPercentCash;
    public int annualFees;
    public int cashLimit;
    public int gracePeriod;
    public double cashWithdrawalFees;
    public int firstYearFees;
    public int gracePeriodCash;
    public double notConfCreditPercent;
    public double creditPercentCash;
}
