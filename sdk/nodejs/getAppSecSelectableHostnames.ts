// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.getAppSecSelectableHostnames` data source to retrieve the list of hostnames that may be protected under a given security configuration version.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: "Akamai Tools",
 * });
 * const selectableHostnamesAppSecSelectableHostnames = Promise.all([configuration, configuration]).then(([configuration, configuration1]) => akamai.getAppSecSelectableHostnames({
 *     configId: configuration.configId,
 *     version: configuration1.latestVersion,
 * }));
 * export const selectableHostnames = selectableHostnamesAppSecSelectableHostnames.then(selectableHostnamesAppSecSelectableHostnames => selectableHostnamesAppSecSelectableHostnames.hostnames);
 * export const selectableHostnamesJson = selectableHostnamesAppSecSelectableHostnames.then(selectableHostnamesAppSecSelectableHostnames => selectableHostnamesAppSecSelectableHostnames.hostnamesJson);
 * export const selectableHostnamesOutputText = selectableHostnamesAppSecSelectableHostnames.then(selectableHostnamesAppSecSelectableHostnames => selectableHostnamesAppSecSelectableHostnames.outputText);
 * ```
 */
export function getAppSecSelectableHostnames(args: GetAppSecSelectableHostnamesArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecSelectableHostnamesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecSelectableHostnames:getAppSecSelectableHostnames", {
        "activeInProduction": args.activeInProduction,
        "activeInStaging": args.activeInStaging,
        "configId": args.configId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecSelectableHostnames.
 */
export interface GetAppSecSelectableHostnamesArgs {
    readonly activeInProduction?: boolean;
    readonly activeInStaging?: boolean;
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: number;
    /**
     * The version number of the security configuration to use.
     */
    readonly version: number;
}

/**
 * A collection of values returned by getAppSecSelectableHostnames.
 */
export interface GetAppSecSelectableHostnamesResult {
    readonly activeInProduction?: boolean;
    readonly activeInStaging?: boolean;
    readonly configId: number;
    /**
     * The list of selectable hostnames.
     */
    readonly hostnames: string[];
    /**
     * The list of selectable hostnames in json format.
     */
    readonly hostnamesJson: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A tabular display of the selectable hostnames showing the name and configId of the security configuration under which the host is protected in production, or '-' if the host is not protected in production.
     */
    readonly outputText: string;
    readonly version: number;
}