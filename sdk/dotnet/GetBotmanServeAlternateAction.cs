// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetBotmanServeAlternateAction
    {
        public static Task<GetBotmanServeAlternateActionResult> InvokeAsync(GetBotmanServeAlternateActionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBotmanServeAlternateActionResult>("akamai:index/getBotmanServeAlternateAction:getBotmanServeAlternateAction", args ?? new GetBotmanServeAlternateActionArgs(), options.WithDefaults());

        public static Output<GetBotmanServeAlternateActionResult> Invoke(GetBotmanServeAlternateActionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBotmanServeAlternateActionResult>("akamai:index/getBotmanServeAlternateAction:getBotmanServeAlternateAction", args ?? new GetBotmanServeAlternateActionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBotmanServeAlternateActionArgs : global::Pulumi.InvokeArgs
    {
        [Input("actionId")]
        public string? ActionId { get; set; }

        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        public GetBotmanServeAlternateActionArgs()
        {
        }
        public static new GetBotmanServeAlternateActionArgs Empty => new GetBotmanServeAlternateActionArgs();
    }

    public sealed class GetBotmanServeAlternateActionInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("actionId")]
        public Input<string>? ActionId { get; set; }

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        public GetBotmanServeAlternateActionInvokeArgs()
        {
        }
        public static new GetBotmanServeAlternateActionInvokeArgs Empty => new GetBotmanServeAlternateActionInvokeArgs();
    }


    [OutputType]
    public sealed class GetBotmanServeAlternateActionResult
    {
        public readonly string? ActionId;
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;

        [OutputConstructor]
        private GetBotmanServeAlternateActionResult(
            string? actionId,

            int configId,

            string id,

            string json)
        {
            ActionId = actionId;
            ConfigId = configId;
            Id = id;
            Json = json;
        }
    }
}