// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanAkamaiDefinedBot(args?: GetBotmanAkamaiDefinedBotArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanAkamaiDefinedBotResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanAkamaiDefinedBot:getBotmanAkamaiDefinedBot", {
        "botName": args.botName,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanAkamaiDefinedBot.
 */
export interface GetBotmanAkamaiDefinedBotArgs {
    botName?: string;
}

/**
 * A collection of values returned by getBotmanAkamaiDefinedBot.
 */
export interface GetBotmanAkamaiDefinedBotResult {
    readonly botName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
}
export function getBotmanAkamaiDefinedBotOutput(args?: GetBotmanAkamaiDefinedBotOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBotmanAkamaiDefinedBotResult> {
    return pulumi.output(args).apply((a: any) => getBotmanAkamaiDefinedBot(a, opts))
}

/**
 * A collection of arguments for invoking getBotmanAkamaiDefinedBot.
 */
export interface GetBotmanAkamaiDefinedBotOutputArgs {
    botName?: pulumi.Input<string>;
}