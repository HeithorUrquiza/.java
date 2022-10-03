package poo.final_project;

public class Video implements AcoesVideo{

    private String titlel;
    private int evaluation;
    private int views;
    private int likes;
    private boolean reproduce;
    

    public Video(String titlel) {
        this.titlel = titlel;
        this.evaluation = 0;
        this.views = 0;
        this.likes = 0;
        this.reproduce = false;
    }


    public String getTitlel() {
        return titlel;
    }

    public void setTitlel(String titlel) {
        this.titlel = titlel;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        int newEva = 0;
        newEva = (this.getEvaluation() + evaluation) / this.getViews();
        this.evaluation = (int) newEva;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getReproduce() {
        return reproduce;
    }

    public void setReproduce(boolean reproduce) {
        this.reproduce = reproduce;
    }
    

    @Override
    public void play() {
        this.setReproduce(true);
    }

    @Override
    public void pause() {
        this.setReproduce(false);
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
    }


    @Override
    public String toString() {
        return "Título: " +titlel+ " | Avaliação: " +evaluation+ " | Curtidas: " +likes+ " | Visualizações: " +views;
    }

    
}
