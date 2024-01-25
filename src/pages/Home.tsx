import { IonContent, IonText, IonRow, IonCol, IonHeader, IonPage, IonTitle, IonToolbar, IonButton, IonImg } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';
import './Home.css';

const Home: React.FC = () => {
    return (
      <IonPage>
        <IonHeader>
          <IonToolbar color="primary">
            <IonTitle>Ionic React App</IonTitle>
          </IonToolbar>
        </IonHeader>
        <IonContent className="ion-padding">
          <IonRow>
            <IonCol className="text-center">
              <IonImg className="title-img" src="assets/capacitor.png" ></IonImg>
            </IonCol>
          </IonRow>
          <IonRow>
            <IonCol className="text-center">
              <IonText className="title">
                Google Login in Capacitor app
              </IonText>
            </IonCol>
          </IonRow>
          <IonRow>
            <IonCol className="text-center">
              <IonText className="text-center">
                By Enappd Team
              </IonText>
            </IonCol>
          </IonRow>

          <IonButton className="login-button" expand="block" fill="solid" color="danger">
            Login with Google
        </IonButton>
        </IonContent>
      </IonPage>
    )
};

export default Home;
