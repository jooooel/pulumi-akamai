// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.NetworkListSubscriptionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.NetworkListSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Use the `akamai.NetworkListSubscription` resource to specify a set of email addresses to be notified of changes to any
 * of a set of network lists.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.akamai.AkamaiFunctions;
 * import com.pulumi.akamai.inputs.GetNetworkListsArgs;
 * import com.pulumi.akamai.NetworkListSubscription;
 * import com.pulumi.akamai.NetworkListSubscriptionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var networkListsFilter = AkamaiFunctions.getNetworkLists(GetNetworkListsArgs.builder()
 *             .name(var_.network_list())
 *             .build());
 * 
 *         var subscribe = new NetworkListSubscription(&#34;subscribe&#34;, NetworkListSubscriptionArgs.builder()        
 *             .networkLists(networkListsFilter.applyValue(getNetworkListsResult -&gt; getNetworkListsResult.lists()))
 *             .recipients(&#34;user@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="akamai:index/networkListSubscription:NetworkListSubscription")
public class NetworkListSubscription extends com.pulumi.resources.CustomResource {
    /**
     * A list containing one or more IDs of the network lists to which the indicated email
     * addresses should be subscribed.
     * 
     */
    @Export(name="networkLists", type=List.class, parameters={String.class})
    private Output<List<String>> networkLists;

    /**
     * @return A list containing one or more IDs of the network lists to which the indicated email
     * addresses should be subscribed.
     * 
     */
    public Output<List<String>> networkLists() {
        return this.networkLists;
    }
    /**
     * A bracketed, comma-separated list of email addresses that will be notified of changes to any
     * of the specified network lists.
     * 
     */
    @Export(name="recipients", type=List.class, parameters={String.class})
    private Output<List<String>> recipients;

    /**
     * @return A bracketed, comma-separated list of email addresses that will be notified of changes to any
     * of the specified network lists.
     * 
     */
    public Output<List<String>> recipients() {
        return this.recipients;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkListSubscription(String name) {
        this(name, NetworkListSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkListSubscription(String name, NetworkListSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkListSubscription(String name, NetworkListSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/networkListSubscription:NetworkListSubscription", name, args == null ? NetworkListSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkListSubscription(String name, Output<String> id, @Nullable NetworkListSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/networkListSubscription:NetworkListSubscription", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkListSubscription get(String name, Output<String> id, @Nullable NetworkListSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkListSubscription(name, id, state, options);
    }
}