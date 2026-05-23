class Bank {
    protected double balance = 1000;

    public double getInterest() {
        return balance * 0.05;
    }

    public Bank getInstance() {
        return new Bank();
    }
}

class SavingsAccount extends Bank {

    @Override
    public double getInterest() {
        return balance * 0.07;
    }

    @Override
    public SavingsAccount getInstance() {
        return new SavingsAccount();
    }

    public static void main(String[] args) {
        Bank acc = new SavingsAccount();
        System.out.println("Процент: " + acc.getInterest());
        System.out.println("Тип: " + acc.getInstance().getClass().getSimpleName());
    }
}