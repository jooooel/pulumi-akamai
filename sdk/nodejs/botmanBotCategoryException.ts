// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class BotmanBotCategoryException extends pulumi.CustomResource {
    /**
     * Get an existing BotmanBotCategoryException resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BotmanBotCategoryExceptionState, opts?: pulumi.CustomResourceOptions): BotmanBotCategoryException {
        return new BotmanBotCategoryException(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/botmanBotCategoryException:BotmanBotCategoryException';

    /**
     * Returns true if the given object is an instance of BotmanBotCategoryException.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BotmanBotCategoryException {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BotmanBotCategoryException.__pulumiType;
    }

    public readonly botCategoryException!: pulumi.Output<string>;
    public readonly configId!: pulumi.Output<number>;
    public readonly securityPolicyId!: pulumi.Output<string>;

    /**
     * Create a BotmanBotCategoryException resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BotmanBotCategoryExceptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BotmanBotCategoryExceptionArgs | BotmanBotCategoryExceptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BotmanBotCategoryExceptionState | undefined;
            resourceInputs["botCategoryException"] = state ? state.botCategoryException : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as BotmanBotCategoryExceptionArgs | undefined;
            if ((!args || args.botCategoryException === undefined) && !opts.urn) {
                throw new Error("Missing required property 'botCategoryException'");
            }
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["botCategoryException"] = args ? args.botCategoryException : undefined;
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BotmanBotCategoryException.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BotmanBotCategoryException resources.
 */
export interface BotmanBotCategoryExceptionState {
    botCategoryException?: pulumi.Input<string>;
    configId?: pulumi.Input<number>;
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BotmanBotCategoryException resource.
 */
export interface BotmanBotCategoryExceptionArgs {
    botCategoryException: pulumi.Input<string>;
    configId: pulumi.Input<number>;
    securityPolicyId: pulumi.Input<string>;
}