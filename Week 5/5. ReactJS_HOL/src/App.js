import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Cohorts Details</h2>
      <CohortDetails
        name="INTADMDF10 - .NET FSD"
        status="Scheduled"
        startedOn="22-Feb-2022"
        coach="Aathma"
        trainer="Jojo Jose"
      />
      <CohortDetails
        name="ADM21JF014 - Java FSD"
        status="Ongoing"
        startedOn="10-Sep-2021"
        coach="Apoorv"
        trainer="Elisa Smith"
      />
      <CohortDetails
        name="CDBJF21025 - Java FSD"
        status="Ongoing"
        startedOn="24-Dec-2021"
        coach="Aathma"
        trainer="John Doe"
      />
    </div>
  );
}

export default App;
