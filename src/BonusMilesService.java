public class BonusMilesService {
    int bonusRequirement = 20;
    public int calculate(int price) {
        return price / bonusRequirement;
    }
}
