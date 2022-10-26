package poo.jornal_desportivo;

public class Jogo {

    private String date;
    private String hour;
    private String locale;
    private Arbitro judge;
    private boolean marked;
    private Equipe visitor;
    private Equipe fromHome;
    private Equipe winner;
    private Equipe loser;

    // Construtor
    public Jogo(String date, String hour, String locale, Arbitro judge, Equipe visitor, Equipe fromHome) {
        this.date = date;
        this.hour = hour;
        this.locale = locale;
        this.judge = judge;
        this.marked = false;
        this.visitor = visitor;
        this.fromHome = fromHome;
    }
    
    // Getters e Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Arbitro getJudge() {
        return judge;
    }

    public void setJudge(Arbitro judge) {
        this.judge = judge;
    }

    public boolean getMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public Equipe getVisitor() {
        return visitor;
    }

    public void setVisitor(Equipe visitor) {
        this.visitor = visitor;
    }

    public Equipe getFromHome() {
        return fromHome;
    }

    public void setFromHome(Equipe fromHome) {
        this.fromHome = fromHome;
    }

    public Equipe getWinner() {
        return winner;
    }

    public void setWinner(Equipe winner) {
        this.winner = winner;
    }

    public Equipe getLoser() {
        return loser;
    }

    public void setLoser(Equipe loser) {
        this.loser = loser;
    }    

    // Métodos
    public void scheduleGame(){ // Marca um jogo se ambos os times estiverem na mesma divisão
        if (this.fromHome.getDivision().equals(this.visitor.getDivision()) && this.fromHome.getName() != this.visitor.getName()) {
            this.setMarked(true);
        }
    }   

    public String showTeams() { // Exibe todos os dados dos respectivos times
        return "\n {** Time Visitado **} \n-----------------------" + fromHome.toString() + "\n\n{** Time Visitante **} \n-----------------------" + visitor.toString();
    }
    
    public String showScore(Equipe winner, int golsW, Equipe loser, int golsL){ // Coleta o time vencedor, perdedor e a quantidade de gols respectivamente
        String text = null;
        if(marked){ // Exibe o plcar caso esse jogo tenha sido aprovado/marcado
            if (golsW != golsL) {
                this.setWinner(winner);
                this.setLoser(loser);
                this.winner.setWins(this.winner.getWins() + 1);
                this.winner.setAmPoints(this.winner.getAmPoints() + 3);
                this.loser.setLoses(this.loser.getLoses() + 1);
                this.loser.setAmPoints(this.loser.getAmPoints() - 2);
            } else { // Caso o jogo resulte em empate
                this.setWinner(winner);
                this.setLoser(loser);
                this.winner.setAmPoints(this.winner.getAmPoints() + 1);
                this.loser.setAmPoints(this.loser.getAmPoints() + 1); 
            }
            text = "\n-----------------------------\n" + "         " + this.getDate() + "\n\n ** Resultado da partida **\n" + "    " + 
            this.winner.getName() + " " + golsW + " x " + golsL + " " + this.loser.getName() + "\n-----------------------------";
        } else {
            text = "Essa partida ainda não aconteceu";
        }
        return text;
    }

    @Override
    public String toString() { // Retona as informações de cada jogo
        String text = null;
        if(marked){
            text = "\nData: " + date + " | Hora: " +hour+ " | Local: " +locale+ " | Árbitro: " +judge.getName()+ 
            " | Time de Casa: " + fromHome.getName() + " | Time Visitante: " + visitor.getName();
        } else {
            text = "\nEsta partida não foi aprovada devido a diferença de classificação dos times";
        }
        return text;
    }
    
    
}
