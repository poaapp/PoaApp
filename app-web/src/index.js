/*
 * Copyright (C) 2016 Actor LLC. <https://actor.im>
 */

import { ActorSDK, ActorSDKDelegate } from 'actor-sdk';

const components = {};
const actions = {};
const l18n = {};

const options = {
  endpoints: [
    'ws://app.poaapp.co.tz:9080'
  ],
  delegate: new ActorSDKDelegate(components, actions, l18n),
  rootElement: 'poa-app',
  appName: 'POA APP'
};

const app = new ActorSDK({...options});

app.startApp();
