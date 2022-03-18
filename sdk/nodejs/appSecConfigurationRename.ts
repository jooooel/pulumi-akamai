// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Security configuration
 *
 * Renames an existing security configuration.
 * Note that you can only change the configuration name.
 * The ID assigned to a security configuration can not be modified.
 *
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putrenameconfiguration)
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configurationAppSecConfiguration = akamai.getAppSecConfiguration({
 *     name: "Documentation",
 * });
 * const configurationAppSecConfigurationRename = new akamai.AppSecConfigurationRename("configurationAppSecConfigurationRename", {
 *     configId: configurationAppSecConfiguration.then(configurationAppSecConfiguration => configurationAppSecConfiguration.configId),
 *     description: "This configuration is by both the documentation team and the training team.",
 * });
 * ```
 */
export class AppSecConfigurationRename extends pulumi.CustomResource {
    /**
     * Get an existing AppSecConfigurationRename resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecConfigurationRenameState, opts?: pulumi.CustomResourceOptions): AppSecConfigurationRename {
        return new AppSecConfigurationRename(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecConfigurationRename:AppSecConfigurationRename';

    /**
     * Returns true if the given object is an instance of AppSecConfigurationRename.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecConfigurationRename {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecConfigurationRename.__pulumiType;
    }

    /**
     * . Unique identifier of the security configurating being renamed.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * . Brief description of the security configuration.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * . New name for the security configuration.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AppSecConfigurationRename resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecConfigurationRenameArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecConfigurationRenameArgs | AppSecConfigurationRenameState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecConfigurationRenameState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AppSecConfigurationRenameArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecConfigurationRename.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecConfigurationRename resources.
 */
export interface AppSecConfigurationRenameState {
    /**
     * . Unique identifier of the security configurating being renamed.
     */
    configId?: pulumi.Input<number>;
    /**
     * . Brief description of the security configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * . New name for the security configuration.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecConfigurationRename resource.
 */
export interface AppSecConfigurationRenameArgs {
    /**
     * . Unique identifier of the security configurating being renamed.
     */
    configId: pulumi.Input<number>;
    /**
     * . Brief description of the security configuration.
     */
    description: pulumi.Input<string>;
    /**
     * . New name for the security configuration.
     */
    name?: pulumi.Input<string>;
}